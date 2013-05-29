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
 * <p>Java class for EdgeMappingListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EdgeMappingListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EdgeMapping" type="{}EdgeMappingType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EdgeMappingListType", propOrder = {
    "edgeMapping"
})
public class EdgeMappingListType {

    @XmlElement(name = "EdgeMapping")
    protected List<EdgeMappingType> edgeMapping;

    /**
     * Gets the value of the edgeMapping property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the edgeMapping property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEdgeMapping().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EdgeMappingType }
     * 
     * 
     */
    public List<EdgeMappingType> getEdgeMapping() {
        if (edgeMapping == null) {
            edgeMapping = new ArrayList<EdgeMappingType>();
        }
        return this.edgeMapping;
    }

    /**
     * Sets the value of the edgeMapping property.
     * 
     * @param edgeMapping
     *     allowed object is
     *     {@link EdgeMappingType }
     *     
     */
    public void setEdgeMapping(List<EdgeMappingType> edgeMapping) {
        this.edgeMapping = edgeMapping;
    }

}