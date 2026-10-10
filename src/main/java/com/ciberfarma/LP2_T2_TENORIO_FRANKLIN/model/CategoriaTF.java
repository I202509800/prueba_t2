package com.ciberfarma.LP2_T2_TENORIO_FRANKLIN.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="tbl_categoria")
@Getter
@Setter
public class CategoriaTF {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer idcategoria;
	
	@Column(name="descripcion")
	private String descripcion;

}
