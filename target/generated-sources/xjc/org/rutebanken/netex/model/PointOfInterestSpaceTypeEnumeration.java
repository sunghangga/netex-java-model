//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PointOfInterestSpaceTypeEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PointOfInterestSpaceTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="arena"/&gt;
 *     &lt;enumeration value="archeryArena"/&gt;
 *     &lt;enumeration value="athleteArea"/&gt;
 *     &lt;enumeration value="auditorium"/&gt;
 *     &lt;enumeration value="changingRoom"/&gt;
 *     &lt;enumeration value="court"/&gt;
 *     &lt;enumeration value="downhillSkiingCourse"/&gt;
 *     &lt;enumeration value="freestyleSkiingCourse"/&gt;
 *     &lt;enumeration value="skiboardingArea"/&gt;
 *     &lt;enumeration value="gates"/&gt;
 *     &lt;enumeration value="greenRoom"/&gt;
 *     &lt;enumeration value="hospitalityZone"/&gt;
 *     &lt;enumeration value="iceRink"/&gt;
 *     &lt;enumeration value="orchestralPit"/&gt;
 *     &lt;enumeration value="playingField"/&gt;
 *     &lt;enumeration value="podium"/&gt;
 *     &lt;enumeration value="pool"/&gt;
 *     &lt;enumeration value="divingPool"/&gt;
 *     &lt;enumeration value="pressArea"/&gt;
 *     &lt;enumeration value="queuingAreaForEntrance"/&gt;
 *     &lt;enumeration value="ridingArea"/&gt;
 *     &lt;enumeration value="rowingArea"/&gt;
 *     &lt;enumeration value="securityScreeningArea"/&gt;
 *     &lt;enumeration value="sledRun"/&gt;
 *     &lt;enumeration value="spectatorTerrace"/&gt;
 *     &lt;enumeration value="spectatorSeating"/&gt;
 *     &lt;enumeration value="spectatorStandingArea"/&gt;
 *     &lt;enumeration value="sportsArea"/&gt;
 *     &lt;enumeration value="stabling"/&gt;
 *     &lt;enumeration value="stage"/&gt;
 *     &lt;enumeration value="ring"/&gt;
 *     &lt;enumeration value="ticketing"/&gt;
 *     &lt;enumeration value="track"/&gt;
 *     &lt;enumeration value="trackside"/&gt;
 *     &lt;enumeration value="velodrome"/&gt;
 *     &lt;enumeration value="warmUpArea"/&gt;
 *     &lt;enumeration value="waterside"/&gt;
 *     &lt;enumeration value="undefined"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PointOfInterestSpaceTypeEnumeration")
@XmlEnum
public enum PointOfInterestSpaceTypeEnumeration {

    @XmlEnumValue("arena")
    ARENA("arena"),
    @XmlEnumValue("archeryArena")
    ARCHERY_ARENA("archeryArena"),
    @XmlEnumValue("athleteArea")
    ATHLETE_AREA("athleteArea"),
    @XmlEnumValue("auditorium")
    AUDITORIUM("auditorium"),
    @XmlEnumValue("changingRoom")
    CHANGING_ROOM("changingRoom"),
    @XmlEnumValue("court")
    COURT("court"),
    @XmlEnumValue("downhillSkiingCourse")
    DOWNHILL_SKIING_COURSE("downhillSkiingCourse"),
    @XmlEnumValue("freestyleSkiingCourse")
    FREESTYLE_SKIING_COURSE("freestyleSkiingCourse"),
    @XmlEnumValue("skiboardingArea")
    SKIBOARDING_AREA("skiboardingArea"),
    @XmlEnumValue("gates")
    GATES("gates"),
    @XmlEnumValue("greenRoom")
    GREEN_ROOM("greenRoom"),
    @XmlEnumValue("hospitalityZone")
    HOSPITALITY_ZONE("hospitalityZone"),
    @XmlEnumValue("iceRink")
    ICE_RINK("iceRink"),
    @XmlEnumValue("orchestralPit")
    ORCHESTRAL_PIT("orchestralPit"),
    @XmlEnumValue("playingField")
    PLAYING_FIELD("playingField"),
    @XmlEnumValue("podium")
    PODIUM("podium"),
    @XmlEnumValue("pool")
    POOL("pool"),
    @XmlEnumValue("divingPool")
    DIVING_POOL("divingPool"),
    @XmlEnumValue("pressArea")
    PRESS_AREA("pressArea"),
    @XmlEnumValue("queuingAreaForEntrance")
    QUEUING_AREA_FOR_ENTRANCE("queuingAreaForEntrance"),
    @XmlEnumValue("ridingArea")
    RIDING_AREA("ridingArea"),
    @XmlEnumValue("rowingArea")
    ROWING_AREA("rowingArea"),
    @XmlEnumValue("securityScreeningArea")
    SECURITY_SCREENING_AREA("securityScreeningArea"),
    @XmlEnumValue("sledRun")
    SLED_RUN("sledRun"),
    @XmlEnumValue("spectatorTerrace")
    SPECTATOR_TERRACE("spectatorTerrace"),
    @XmlEnumValue("spectatorSeating")
    SPECTATOR_SEATING("spectatorSeating"),
    @XmlEnumValue("spectatorStandingArea")
    SPECTATOR_STANDING_AREA("spectatorStandingArea"),
    @XmlEnumValue("sportsArea")
    SPORTS_AREA("sportsArea"),
    @XmlEnumValue("stabling")
    STABLING("stabling"),
    @XmlEnumValue("stage")
    STAGE("stage"),
    @XmlEnumValue("ring")
    RING("ring"),
    @XmlEnumValue("ticketing")
    TICKETING("ticketing"),
    @XmlEnumValue("track")
    TRACK("track"),
    @XmlEnumValue("trackside")
    TRACKSIDE("trackside"),
    @XmlEnumValue("velodrome")
    VELODROME("velodrome"),
    @XmlEnumValue("warmUpArea")
    WARM_UP_AREA("warmUpArea"),
    @XmlEnumValue("waterside")
    WATERSIDE("waterside"),
    @XmlEnumValue("undefined")
    UNDEFINED("undefined"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    PointOfInterestSpaceTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PointOfInterestSpaceTypeEnumeration fromValue(String v) {
        for (PointOfInterestSpaceTypeEnumeration c: PointOfInterestSpaceTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}