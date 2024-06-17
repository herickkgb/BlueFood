package br.com.herick.bluefood.domain.usuario;

import java.io.Serializable;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@MappedSuperclass
public class Usuario implements Serializable {
	private static final long serialVersionUID = 720748133877352968L;

	@EqualsAndHashCode.Include
	@Id
	private Integer id;
	private String nome;
	private String senha;
	private String email;
	private String telefone;
}
