package br.com.herick.bluefood.domain.cliente;

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
    private static final long serialVersionUID = 7046877745379911074L;

    private String cpf;
    private String cep;
}
