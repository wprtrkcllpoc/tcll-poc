
package tr.com.yurticikargo.sswıntegrationservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for shippingDataV3ResponseVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="shippingDataV3ResponseVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://yurticikargo.com.tr/sswIntegrationServices}baseResultVO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="shippingDataDetailVOArray" type="{http://yurticikargo.com.tr/sswIntegrationServices}ShippingDataV3DetailVO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "shippingDataV3ResponseVO", propOrder = {
    "shippingDataDetailVOArray"
})
public class ShippingDataV3ResponseVO
    extends BaseResultVO
{

    @XmlElement(nillable = true)
    protected List<ShippingDataV3DetailVO> shippingDataDetailVOArray;

    /**
     * Gets the value of the shippingDataDetailVOArray property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shippingDataDetailVOArray property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShippingDataDetailVOArray().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShippingDataV3DetailVO }
     * 
     * 
     */
    public List<ShippingDataV3DetailVO> getShippingDataDetailVOArray() {
        if (shippingDataDetailVOArray == null) {
            shippingDataDetailVOArray = new ArrayList<ShippingDataV3DetailVO>();
        }
        return this.shippingDataDetailVOArray;
    }

}
