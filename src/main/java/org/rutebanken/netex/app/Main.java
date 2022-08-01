/*
 * Licensed under the EUPL, Version 1.2 or - as soon they will be approved by
 * the European Commission - subsequent versions of the EUPL (the "Licence");
 * You may not use this work except in compliance with the Licence.
 * You may obtain a copy of the Licence at:
 *
 *   https://joinup.ec.europa.eu/software/page/eupl
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the Licence is distributed on an "AS IS" basis,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Licence for the specific language governing permissions and
 * limitations under the Licence.
 */

package org.rutebanken.netex.app;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AvailableSettings;
import org.hibernate.cfg.Configuration;
import org.rutebanken.netex.entity.*;
import org.rutebanken.netex.model.*;

public class Main {
	
	private static JAXBContext jaxbContext;

	public static void initContext() throws JAXBException {
		jaxbContext = JAXBContext.newInstance(PublicationDeliveryStructure.class);

	}
	
	public static void main(String[] args) throws JAXBException, FileNotFoundException {
		Main.initContext();
		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		
		@SuppressWarnings("unchecked")
		JAXBElement<PublicationDeliveryStructure> jaxbElement = (JAXBElement<PublicationDeliveryStructure>) unmarshaller
				.unmarshal(new FileInputStream(new File("D:/Netex Dataset/NeTEx_CXX_2021-05-02_baseline_2021008_new.xml")));
		
		// Start session
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.setProperty(AvailableSettings.HBM2DDL_AUTO, "update")
								.setProperty(AvailableSettings.HBM2DDL_HALT_ON_ERROR, "true")
//								.addAnnotatedClass(FrameDefaultEntity.class)
								.addAnnotatedClass(VersionEntity.class)
								.addAnnotatedClass(RoutePointEntity.class)
								.addAnnotatedClass(RouteEntity.class)
								.addAnnotatedClass(PointOnRouteEntity.class)
								.addAnnotatedClass(AvailabilityConditionEntity.class)
								.addAnnotatedClass(ServiceJourneyEntity.class)
								.addAnnotatedClass(LineEntity.class)
								.addAnnotatedClass(DestinationDisplayEntity.class)
								.addAnnotatedClass(ScheduledStopPointEntity.class)
								.addAnnotatedClass(TimingLinkEntity.class)
								.addAnnotatedClass(ServiceJourneyPatternEntity.class)
								.addAnnotatedClass(StopPointJourneyPatternEntity.class)
								.addAnnotatedClass(TimeDemandTypeEntity.class)
								.addAnnotatedClass(JourneyRunTimeEntity.class)
								.addAnnotatedClass(JourneyWaitTimeEntity.class)
								.addAnnotatedClass(NoticeEntity.class)
								.addAnnotatedClass(NoticeAssignmentEntity.class)
								.addAnnotatedClass(BlockEntity.class)
								.addAnnotatedClass(DataSourceEntity.class)
								.addAnnotatedClass(ResponsibilitySetEntity.class)
								.addAnnotatedClass(TypeOfProductCategoryEntity.class)
								.addAnnotatedClass(OperatorEntity.class)
								.addAnnotatedClass(AuthorityEntity.class)
								.addAnnotatedClass(ResponsibilityRoleAssignmentEntity.class)
								.addAnnotatedClass(BrandingEntity.class)
								.addAnnotatedClass(OperationalContextEntity.class)
								.addAnnotatedClass(VehicleEntity.class)
								.addAnnotatedClass(VehicleTypeEntity.class)
								.addAnnotatedClass(AdministrativeZoneEntity.class)
								.addAnnotatedClass(ActivationPointEntity.class)
								.addAnnotatedClass(RouteLinkEntity.class)
								.addAnnotatedClass(PointOnLinkEntity.class)
								.addAnnotatedClass(StopAreaEntity.class)
								.addAnnotatedClass(PassengerStopAssignmentEntity.class)
								.addAnnotatedClass(TimingPointEntity.class)
								.addAnnotatedClass(TimingPointJourneyPatternEntity.class)
								.addAnnotatedClass(JourneyLayoverEntity.class)
								.addAnnotatedClass(DayTypeEntity.class)
								.addAnnotatedClass(DayTypeAssignmentEntity.class)
								.buildSessionFactory();
					
		// Initial session variable
		Session session = null;
	    Transaction transaction = null;
		
		try {
			
			// Open session
			session = factory.openSession();
			
			// Start a transaction
			transaction = session.beginTransaction();
			System.out.println("Begin Transaction...");
			
			// Composite frame init
			CompositeFrame compositeFrameValue = (CompositeFrame) jaxbElement.getValue().getDataObjects().getCompositeFrameOrCommonFrame().get(0).getValue();

			// Initial version
			String version = compositeFrameValue.getVersion();
			
//			// Frame Defaults parser
//			FrameDefaultParser frameDefaults = new FrameDefaultParser();
//			frameDefaults.parser(compositeFrameValue.getFrameDefaults(), version, session);
			
			// Version parser
			VersionParser versions = new VersionParser();
			versions.parser(compositeFrameValue.getVersions().getVersionRefOrVersion(), session);
			
			// Frames parser
			for (int i = 0; i < compositeFrameValue.getFrames().getCommonFrame().size(); i = i + 1) {
				// Check resource frame object
				if (compositeFrameValue.getFrames().getCommonFrame().get(i).getValue() instanceof ResourceFrame) {
					ResourceFrame resourceFrameValue = (ResourceFrame) compositeFrameValue.getFrames().getCommonFrame().get(i).getValue();
					// DataSource parser
					if (resourceFrameValue.getDataSources() != null) {
						DataSourceParser dataSource = new DataSourceParser();
						dataSource.parser(resourceFrameValue.getDataSources().getDataSource(), version, session);
					}
					// ResponsibilitySet parser
					if (resourceFrameValue.getResponsibilitySets() != null) {
						ResponsibilitySetParser responsibilitySet = new ResponsibilitySetParser();
						responsibilitySet.parser(resourceFrameValue.getResponsibilitySets().getResponsibilitySet(), version, session);
					}
					// Branding and TypeOfProductCategory parser
					if (resourceFrameValue.getTypesOfValue() != null) {
						TypeOfProductCategoryParser typeOfProductCategory = new TypeOfProductCategoryParser();
						typeOfProductCategory.parser(resourceFrameValue.getTypesOfValue().getValueSetOrTypeOfValue(), version, session);
					}
					// Operator and Authority parser
					if (resourceFrameValue.getOrganisations() != null) {
						OperatorParser operator = new OperatorParser();
						operator.parser(resourceFrameValue.getOrganisations().getOrganisation_(), version, session);
					}
					// OperationalContexts parser
					if (resourceFrameValue.getOperationalContexts() != null) {
						OperationalContextParser operationalContext = new OperationalContextParser();
						operationalContext.parser(resourceFrameValue.getOperationalContexts().getOperationalContext(), version, session);
					}
					// Vehicles parser
					if (resourceFrameValue.getVehicles() != null) {
						VehicleParser vehicle = new VehicleParser();
						vehicle.parser(resourceFrameValue.getVehicles().getTrainElementOrVehicle(), version, session);
					}
					// VehicleTypes parser
					if (resourceFrameValue.getVehicleTypes() != null) {
						VehicleTypeParser vehicleType = new VehicleTypeParser();
						vehicleType.parser(resourceFrameValue.getVehicleTypes().getCompoundTrainOrTrainOrVehicleType(), version, session);
					}
					// Administrative zone parser
					if (resourceFrameValue.getZones() != null) {
						AdministrativeZoneParser administrativeZone = new AdministrativeZoneParser();
						administrativeZone.parser(resourceFrameValue.getZones().getZone(), version, session);
					}
				}
				// Check infrastructure frame object
				else if (compositeFrameValue.getFrames().getCommonFrame().get(i).getValue() instanceof InfrastructureFrame) {
					InfrastructureFrame infrastructureFrameValue = (InfrastructureFrame) compositeFrameValue.getFrames().getCommonFrame().get(i).getValue();
					// ActivationPoints parser
					if (infrastructureFrameValue.getActivationPoints() != null) {
						ActivationPointParser infrastructure = new ActivationPointParser();
						infrastructure.parser(infrastructureFrameValue.getActivationPoints().getActivationPoint_(), version, session);
					}
				}
				// Check service frame object
				else if (compositeFrameValue.getFrames().getCommonFrame().get(i).getValue() instanceof ServiceFrame) {
					ServiceFrame serviceFrameValue = (ServiceFrame) compositeFrameValue.getFrames().getCommonFrame().get(i).getValue();
					// RoutePoint parser
					if (serviceFrameValue.getRoutePoints() != null) {
						RoutePointParser routePoints = new RoutePointParser();
						routePoints.parser(serviceFrameValue.getRoutePoints().getRoutePoint(), version, session);
					}
					// RouteLink parser
					if (serviceFrameValue.getRouteLinks() != null) {
						 RouteLinkParser routelinks = new RouteLinkParser();
						 routelinks.parser(serviceFrameValue.getRouteLinks().getRouteLink(), version, session);
					}
					// Route parser
					if (serviceFrameValue.getRoutes() != null) {
						RouteParser routes = new RouteParser();
						routes.parser(serviceFrameValue.getRoutes().getRoute_(), version, session);
					}
					// Line parser
					if (serviceFrameValue.getLines() != null) {
						LineParser lines = new LineParser();
						lines.parser(serviceFrameValue.getLines().getLine_(), version, session);
					}
					// DestinationDisplay parser
					if (serviceFrameValue.getDestinationDisplays() != null) {
						DestinationDisplayParser destinationDisplays = new DestinationDisplayParser();
						destinationDisplays.parser(serviceFrameValue.getDestinationDisplays().getDestinationDisplay(), version, session);
					}
					// ScheduledStopPoint parser
					if (serviceFrameValue.getScheduledStopPoints() != null) {
						ScheduledStopPointParser scheduledStopPoint = new ScheduledStopPointParser();
						scheduledStopPoint.parser(serviceFrameValue.getScheduledStopPoints().getScheduledStopPoint(), version, session);
					}
					// StopArea parser
					if (serviceFrameValue.getStopAreas() != null) {
						StopAreaParser stopArea = new StopAreaParser();
						stopArea.parser(serviceFrameValue.getStopAreas().getStopArea(), version, session);
					}
					// PassengerStopAssignment parser
					if (serviceFrameValue.getStopAssignments() != null) {
						PassengerStopAssignmentParser stopAssignment = new PassengerStopAssignmentParser();
						stopAssignment.parser(serviceFrameValue.getStopAssignments().getStopAssignment(), version, session);
					}
					// TimingPoint parser
					if (serviceFrameValue.getTimingPoints() != null) {
						TimingPointParser timingPoint = new TimingPointParser();
						timingPoint.parser(serviceFrameValue.getTimingPoints().getTimingPoint(), version, session);
					}
					// TimingLink parser
					if (serviceFrameValue.getTimingLinks() != null) {
						TimingLinkParser timingLink = new TimingLinkParser();
						timingLink.parser(serviceFrameValue.getTimingLinks().getTimingLink(), version, session);
					}
					// ServiceJourneyPattern parser
					if (serviceFrameValue.getJourneyPatterns() != null) {
						ServiceJourneyPatternParser serviceJourneyPattern = new ServiceJourneyPatternParser();
						serviceJourneyPattern.parser(serviceFrameValue.getJourneyPatterns().getJourneyPattern_OrJourneyPatternView(), version, session);
					}
					// TimeDemandTypes parser
					if (serviceFrameValue.getTimeDemandTypes() != null) {
						TimeDemandTypeParser timeDemandTypes = new TimeDemandTypeParser();
						timeDemandTypes.parser(serviceFrameValue.getTimeDemandTypes().getTimeDemandType(), version, session);
					}
					// Notices parser
					if (serviceFrameValue.getTimeDemandTypes() != null) {
						NoticeParser notices = new NoticeParser();
						notices.parser(serviceFrameValue.getNotices().getNotice(), version, session);
					}
					// NoticeAssignments parser
					if (serviceFrameValue.getTimeDemandTypes() != null) {
						NoticeAssignmentParser noticeAssignment = new NoticeAssignmentParser();
						noticeAssignment.parser(serviceFrameValue.getNoticeAssignments().getNoticeAssignment_(), version, session);
					}
				}
				// Check Timetabel frame object
				else if (compositeFrameValue.getFrames().getCommonFrame().get(i).getValue() instanceof TimetableFrame) {
					TimetableFrame timetableFrameValue = (TimetableFrame) compositeFrameValue.getFrames().getCommonFrame().get(i).getValue();

					// AvailabilityCondition parser
					if (timetableFrameValue.getContentValidityConditions() != null) {
						AvailabilityConditionParser availabilityCondition = new AvailabilityConditionParser();
						availabilityCondition.parser(timetableFrameValue.getContentValidityConditions().getAvailabilityConditionRefOrAvailabilityConditionOrValidDuring(), version, session);
					}
					// ServiceJourney parser
					if (timetableFrameValue.getVehicleJourneys() != null) {
						ServiceJourneyParser serviceJourney = new ServiceJourneyParser();
						serviceJourney.parser(timetableFrameValue, version, session);
					}
				}
				// Check ServiceCalendarFrame object
				else if (compositeFrameValue.getFrames().getCommonFrame().get(i).getValue() instanceof ServiceCalendarFrame) {
					ServiceCalendarFrame serviceCalendarFrameValue = (ServiceCalendarFrame) compositeFrameValue.getFrames().getCommonFrame().get(i).getValue();
					// DayType parser
					if (serviceCalendarFrameValue.getDayTypes() != null) {
						DayTypeParser dayType = new DayTypeParser();
						dayType.parser(serviceCalendarFrameValue.getDayTypes().getDayType_(), version, session);
					}
					// DayTypeAssignment parser
					if (serviceCalendarFrameValue.getDayTypeAssignments() != null) {
						DayTypeAssignmentParser dayTypeAssignment = new DayTypeAssignmentParser();
						dayTypeAssignment.parser(serviceCalendarFrameValue.getDayTypeAssignments().getDayTypeAssignment(), version, session);
					}
				}
				// Check VehicleScheduleFrame object
				else if (compositeFrameValue.getFrames().getCommonFrame().get(i).getValue() instanceof VehicleScheduleFrame) {
					VehicleScheduleFrame vehicleScheduleFrameValue = (VehicleScheduleFrame) compositeFrameValue.getFrames().getCommonFrame().get(i).getValue();
					// Block parser
					if (vehicleScheduleFrameValue.getBlocks() != null) {
						BlockParser block = new BlockParser();
						block.parser(vehicleScheduleFrameValue.getBlocks().getBlockOrCompoundBlockOrTrainBlock(), version, session);
					}
				}
			}
			
			// Commit transaction
			session.getTransaction().commit();
			System.out.println("Done!");
		}
		catch (Exception e) {
	        transaction.rollback();
	        throw (e);
	    } 
		finally {
	        session.close();
	    }
	}
}
