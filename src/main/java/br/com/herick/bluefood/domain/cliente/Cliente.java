package br.com.herick.bluefood.domain.cliente;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import br.com.herick.bluefood.domain.usuario.Usuario;
import jakarta.persistence.Entity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = true)
@Entity
public class Cliente extends Usuario {

	private static final long serialVersionUID = 1L;

	@NotBlank(message = "O CPF não pode ser vazio")
	@Pattern(regexp = "[0-9]{11}", message = "O CPF possui formato inválido")
	@Column(length = 11, nullable = false)
	private String cpf;
	
	@NotBlank(message = "O CEP não pode ser vazio")
	@Pattern(regexp = "[0-9]{8}", message = "O CEP possui formato inválido")
	@Column(length = 8, nullable = false)
	private String cep;
}
