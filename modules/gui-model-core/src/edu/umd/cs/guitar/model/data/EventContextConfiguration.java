//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.28 at 08:57:05 PM EDT 
//


package edu.umd.cs.guitar.model.data;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EventContextPattern" type="{}EventContextPatternType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "eventContextPattern"
})
@XmlRootElement(name = "EventContextConfiguration")
public class EventContextConfiguration {

    @XmlElement(name = "EventContextPattern")
    protected List<EventContextPatternType> eventContextPattern;

    /**
     * Gets the value of the eventContextPattern property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventContextPattern property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventContextPattern().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventContextPatternType }
     * 
     * 
     */
    public List<EventContextPatternType> getEventContextPattern() {
        if (eventContextPattern == null) {
            eventContextPattern = new ArrayList<EventContextPatternType>();
        }
        return this.eventContextPattern;
    }

    /**
     * Sets the value of the eventContextPattern property.
     * 
     * @param eventContextPattern
     *     allowed object is
     *     {@link EventContextPatternType }
     *     
     */
    public void setEventContextPattern(List<EventContextPatternType> eventContextPattern) {
        this.eventContextPattern = eventContextPattern;
    }

}
