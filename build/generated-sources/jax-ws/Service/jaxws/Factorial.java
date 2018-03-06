
package Service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "factorial", namespace = "http://Service/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "factorial", namespace = "http://Service/")
public class Factorial {

    @XmlElement(name = "number", namespace = "")
    private int number;

    /**
     * 
     * @return
     *     returns int
     */
    public int getNumber() {
        return this.number;
    }

    /**
     * 
     * @param number
     *     the value for the number property
     */
    public void setNumber(int number) {
        this.number = number;
    }

}
