package com.kouach.exam.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Categorie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id;
   private String nom;
   
   @ManyToOne
   private Categorie categorie;
   public Categorie() {
	super();
}
   public Categorie(String nom) {
	super();
	this.nom = nom;
}
   public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
   
   
}
