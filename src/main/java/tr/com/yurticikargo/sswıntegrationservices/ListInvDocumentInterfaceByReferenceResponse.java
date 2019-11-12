
package tr.com.yurticikargo.sswıntegrationservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listInvDocumentInterfaceByReferenceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listInvDocumentInterfaceByReferenceResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ShippingDataResponseVO" type="{http://yurticikargo.com.tr/sswIntegrationServices}shippingDataResponseVO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listInvDocumentInterfaceByReferenceResponse", propOrder = {
    "shippingDataResponseVO"
})
public class ListInvDocumentInterfaceByReferenceResponse {

    @XmlElement(name = "ShippingDataResponseVO")
    protected ShippingDataResponseVO shippingDataResponseVO;

    /**
     * Gets the value of the shippingDataResponseVO property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingDataResponseVO }
     *     
     */
    public ShippingDataResponseVO getShippingDataResponseVO() {
        return shippingDataResponseVO;
    }

    /**
     * Sets the value of the shippingDataResponseVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingDataResponseVO }
     *     
     */
    public void setShippingDataResponseVO(ShippingDataResponseVO value) {
        this.shippingDataResponseVO = value;
    }

}
