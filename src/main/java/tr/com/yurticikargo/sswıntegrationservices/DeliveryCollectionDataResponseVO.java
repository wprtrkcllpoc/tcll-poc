
package tr.com.yurticikargo.sswıntegrationservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deliveryCollectionDataResponseVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deliveryCollectionDataResponseVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://yurticikargo.com.tr/sswIntegrationServices}extendedBaseResultVO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="deliveryCollectionInfoVOArray" type="{http://yurticikargo.com.tr/sswIntegrationServices}qListDeliveryCollectionInfoVO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deliveryCollectionDataResponseVO", propOrder = {
    "deliveryCollectionInfoVOArray"
})
public class DeliveryCollectionDataResponseVO
    extends ExtendedBaseResultVO
{

    @XmlElement(nillable = true)
    protected List<QListDeliveryCollectionInfoVO> deliveryCollectionInfoVOArray;

    /**
     * Gets the value of the deliveryCollectionInfoVOArray property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deliveryCollectionInfoVOArray property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeliveryCollectionInfoVOArray().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QListDeliveryCollectionInfoVO }
     * 
     * 
     */
    public List<QListDeliveryCollectionInfoVO> getDeliveryCollectionInfoVOArray() {
        if (deliveryCollectionInfoVOArray == null) {
            deliveryCollectionInfoVOArray = new ArrayList<QListDeliveryCollectionInfoVO>();
        }
        return this.deliveryCollectionInfoVOArray;
    }

}
