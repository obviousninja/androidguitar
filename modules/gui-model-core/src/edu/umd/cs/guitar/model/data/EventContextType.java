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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventContextType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventContextType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Invokelist" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="ContextFullEventList" type="{}FullEventListType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventContextType", propOrder = {
    "invokelist",
    "contextFullEventList"
})
public class EventContextType {

    @XmlElement(name = "Invokelist", required = true)
    protected List<String> invokelist;
    @XmlElement(name = "ContextFullEventList", required = true)
    protected FullEventListType contextFullEventList;

    /**
     * Gets the value of the invokelist property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invokelist property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvokelist().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getInvokelist() {
        if (invokelist == null) {
            invokelist = new ArrayList<String>();
        }
        return this.invokelist;
    }

    /**
     * Gets the value of the contextFullEventList property.
     * 
     * @return
     *     possible object is
     *     {@link FullEventListType }
     *     
     */
    public FullEventListType getContextFullEventList() {
        return contextFullEventList;
    }

    /**
     * Sets the value of the contextFullEventList property.
     * 
     * @param value
     *     allowed object is
     *     {@link FullEventListType }
     *     
     */
    public void setContextFullEventList(FullEventListType value) {
        this.contextFullEventList = value;
    }

    /**
     * Sets the value of the invokelist property.
     * 
     * @param invokelist
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvokelist(List<String> invokelist) {
        this.invokelist = invokelist;
    }

}
