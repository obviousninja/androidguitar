//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.28 at 08:57:05 PM EDT 
//


package edu.umd.cs.guitar.model.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContainerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContainerType">
 *   &lt;complexContent>
 *     &lt;extension base="{}ComponentType">
 *       &lt;sequence>
 *         &lt;element name="Contents" type="{}ContentsType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContainerType", propOrder = {
    "contents"
})
public class ContainerType
    extends ComponentType
{

    @XmlElement(name = "Contents", required = true)
    protected ContentsType contents;

    /**
     * Gets the value of the contents property.
     * 
     * @return
     *     possible object is
     *     {@link ContentsType }
     *     
     */
    public ContentsType getContents() {
        return contents;
    }

    /**
     * Sets the value of the contents property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentsType }
     *     
     */
    public void setContents(ContentsType value) {
        this.contents = value;
    }

}
