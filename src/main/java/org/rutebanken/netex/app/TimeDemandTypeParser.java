package org.rutebanken.netex.app;

import java.time.Duration;
import java.util.List;

import org.hibernate.Session;
import org.rutebanken.netex.model.JourneyLayover;
import org.rutebanken.netex.model.JourneyRunTime;
import org.rutebanken.netex.model.JourneyWaitTime;
import org.rutebanken.netex.model.TimeDemandType;
import org.rutebanken.netex.entity.JourneyLayoverEntity;
import org.rutebanken.netex.entity.JourneyRunTimeEntity;
import org.rutebanken.netex.entity.JourneyWaitTimeEntity;
import org.rutebanken.netex.entity.TimeDemandTypeEntity;

class TimeDemandTypeParser {
	
	public void parser (List<TimeDemandType> actual, String versions, Session session) {
		
		// Initial process
		for (int i = 0; i < actual.size(); i = i + 1) {
			TimeDemandType actualValue = (TimeDemandType) actual.get(i);
			String id = (actualValue.getId() == null) ?  null : actualValue.getId();
			String version = (versions == null) ?  null : versions;
			String name = (actualValue.getName() == null) ?  null : actualValue.getName().getValue();
			TimeDemandTypeEntity timeDemandType = new TimeDemandTypeEntity(
					id, 
					version,
					name);
			// Save object
			session.saveOrUpdate(timeDemandType);
			
			// RunTime parser
			if (actualValue.getRunTimes() != null) {
				for (int j = 0; j < actualValue.getRunTimes().getJourneyRunTime().size(); j = j + 1) {
					JourneyRunTime runTimeValue = (JourneyRunTime) actualValue.getRunTimes().getJourneyRunTime().get(j);
					String idRunTime = (runTimeValue.getId() == null) ?  null : runTimeValue.getId();
					String versionRunTime = (versions == null) ?  null : versions;
					String timingLinkRef = (runTimeValue.getTimingLinkRef() == null) ?  null : runTimeValue.getTimingLinkRef().getRef();
					Duration runTime = (runTimeValue.getRunTime() == null) ?  null : runTimeValue.getRunTime();
					String timeDemandTypeRef = id;
					JourneyRunTimeEntity journeyRunTime = new JourneyRunTimeEntity(
												idRunTime, 
												versionRunTime,  
												timingLinkRef, 
												runTime,
												timeDemandTypeRef);
				    // Save object
				    session.saveOrUpdate(journeyRunTime);
				}
			}
			// WaitTime parser
			if (actualValue.getWaitTimes() != null) {
				for (int j = 0; j < actualValue.getWaitTimes().getJourneyWaitTime().size(); j = j + 1) {
					JourneyWaitTime waitTimeValue = (JourneyWaitTime) actualValue.getWaitTimes().getJourneyWaitTime().get(j);
					String idWaitTime = (waitTimeValue.getId() == null) ?  null : waitTimeValue.getId();
					String versionWaitTime = (versions == null) ?  null : versions;
					String scheduledStopPointRef = (waitTimeValue.getTimingPointRef() == null) ?  null : waitTimeValue.getTimingPointRef().getValue().getRef();
					Duration waitTime = (waitTimeValue.getWaitTime() == null) ?  null : waitTimeValue.getWaitTime();
					String timeDemandTypeRef = id;
					JourneyWaitTimeEntity journeyWaitTime = new JourneyWaitTimeEntity(
												idWaitTime, 
												versionWaitTime,  
												scheduledStopPointRef, 
												waitTime,
												timeDemandTypeRef);
				    // Save object
				    session.saveOrUpdate(journeyWaitTime);
				}
			}
			// Layovers parser
			if (actualValue.getLayovers() != null) {
				for (int j = 0; j < actualValue.getLayovers().getJourneyLayover().size(); j = j + 1) {
					JourneyLayover layoverValue = (JourneyLayover) actualValue.getLayovers().getJourneyLayover().get(j);
					String idLayover = (layoverValue.getId() == null) ?  null : layoverValue.getId();
					String versionWaitTime = (versions == null) ?  null : versions;
					String scheduledStopPointRef = (layoverValue.getPointRef() == null) ?  null : layoverValue.getPointRef().getValue().getRef();
					Duration layover = (layoverValue.getLayover() == null) ?  null : layoverValue.getLayover();
					String timeDemandTypeRef = id;
					JourneyLayoverEntity journeyLayover = new JourneyLayoverEntity(
												idLayover, 
												versionWaitTime,  
												scheduledStopPointRef, 
												layover,
												timeDemandTypeRef);
				    // Save object
				    session.saveOrUpdate(journeyLayover);
				}
			}
		}
	}
	
}
