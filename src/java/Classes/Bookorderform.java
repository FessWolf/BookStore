/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Fess
 */
@Entity
@Table(name = "bookorderform")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bookorderform.findAll", query = "SELECT b FROM Bookorderform b")
    , @NamedQuery(name = "Bookorderform.findByOrderId", query = "SELECT b FROM Bookorderform b WHERE b.orderId = :orderId")
    , @NamedQuery(name = "Bookorderform.findByFirstname", query = "SELECT b FROM Bookorderform b WHERE b.firstname = :firstname")
    , @NamedQuery(name = "Bookorderform.findByLastname", query = "SELECT b FROM Bookorderform b WHERE b.lastname = :lastname")
    , @NamedQuery(name = "Bookorderform.findByAdress", query = "SELECT b FROM Bookorderform b WHERE b.adress = :adress")
    , @NamedQuery(name = "Bookorderform.findByQuantity", query = "SELECT b FROM Bookorderform b WHERE b.quantity = :quantity")})
public class Bookorderform implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "order_id")
    private Long orderId;
    @Size(max = 255)
    @Column(name = "firstname")
    private String firstname;
    @Size(max = 255)
    @Column(name = "lastname")
    private String lastname;
    @Size(max = 255)
    @Column(name = "adress")
    private String adress;
    @Column(name = "quantity")
    private Integer quantity;

    public Bookorderform() {
    }

    public Bookorderform(Long orderId) {
        this.orderId = orderId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderId != null ? orderId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bookorderform)) {
            return false;
        }
        Bookorderform other = (Bookorderform) object;
        if ((this.orderId == null && other.orderId != null) || (this.orderId != null && !this.orderId.equals(other.orderId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Classes.Bookorderform[ orderId=" + orderId + " ]";
    }
    
}
