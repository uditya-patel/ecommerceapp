package com.capgemini.entity;

import java.math.BigDecimal;
import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="product")
@Data
public class Product {
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private long productId;
	    private String sku;
	    private String name;
	    private String description;
	    private BigDecimal unitPrice;
	    private boolean active;
	    private int unitsInstock;
	    
	    @CreationTimestamp
	    private Date dateCreated;
	    @UpdateTimestamp
	    private Date lastUpdate;
	    
	    @ManyToOne
	    @JoinColumn(name = "category_id", nullable = false)
	    private ProductCategory category;
	    
	   

}
