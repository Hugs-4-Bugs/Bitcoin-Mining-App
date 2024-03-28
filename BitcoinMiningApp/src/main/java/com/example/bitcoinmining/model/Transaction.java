package com.example.bitcoinmining.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    private double amount;
    private Date timestamp;
    // Add more transaction fields as needed
	public int getAmount() {
		// TODO Auto-generated method stub
		return 0;
	}
	public Object getId() {
		// TODO Auto-generated method stub
		return null;
	}

    // Getters and setters
}
