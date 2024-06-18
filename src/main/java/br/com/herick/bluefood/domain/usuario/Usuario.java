package br.com.herick.bluefood.domain.usuario;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@MappedSuperclass
public class Usuario implements Serializable {
    private static final long serialVersionUID = 720748133877352968L;

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @NotBlank(message = "Nome não pode ser vazio.")
    @Size(min = 3, max = 80, message = "Nome deve ter entre 3 e 80 caracteres.")
    private String nome;
    
    @NotBlank(message = "E-mail não pode ser vazio.")
    @Size(max = 60, message = "E-mail deve ter no máximo 60 caracteres.")
    @Email(message = "Formato de e-mail inválido.")
    private String email;
    
    @NotBlank(message = "Senha não pode ser vazia.")
    @Size(max = 80, message = "Senha deve ter no máximo 80 caracteres.")
    private String senha;
    
    @NotBlank(message = "Telefone não pode ser vazio.")
    @Size(max = 80, message = "Telefone deve ter no máximo 80 caracteres.")
    @Pattern(regexp = "[0-9] {10,11}", message = "Telefone deve conter apenas números e ter entre 10 e 11 dígitos.")
    @Column(length = 11, nullable = false)
	private String telefone;
}
