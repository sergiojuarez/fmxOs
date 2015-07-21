
package com.finmex.omnisuite.client;

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
 *         &lt;element name="NumCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FolioExpediente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "numCliente",
    "folioExpediente"
})
@XmlRootElement(name = "Parametros", namespace = "http://Mascore/Movimientos/Movimientos_Array/Request")
public class Parametros {

    @XmlElement(name = "NumCliente", namespace = "http://Mascore/Movimientos/Movimientos_Array/Request")
    protected String numCliente;
    @XmlElement(name = "FolioExpediente", namespace = "http://Mascore/Movimientos/Movimientos_Array/Request")
    protected String folioExpediente;

    /**
     * Gets the value of the numCliente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumCliente() {
        return numCliente;
    }

    /**
     * Sets the value of the numCliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumCliente(String value) {
        this.numCliente = value;
    }

    /**
     * Gets the value of the folioExpediente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolioExpediente() {
        return folioExpediente;
    }

    /**
     * Sets the value of the folioExpediente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolioExpediente(String value) {
        this.folioExpediente = value;
    }

}
