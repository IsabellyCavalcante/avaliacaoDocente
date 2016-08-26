package pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Question {

	@Id
	@Column
	private Long id;

	@Column
	private String enunciado;

	@Column
	private TipoResposta tipoResposta;

	@Column
	private Boolean comentario;

	public Question(Long id, String enunciado, TipoResposta tipoResposta,
			Boolean comentario) {
		this.id = id;
		this.enunciado = enunciado;
		this.tipoResposta = tipoResposta;
		this.comentario = comentario;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

	public TipoResposta getTipoResposta() {
		return tipoResposta;
	}

	public void setTipoResposta(TipoResposta tipoResposta) {
		this.tipoResposta = tipoResposta;
	}

	public Boolean getComentario() {
		return comentario;
	}

	public void setComentario(Boolean comentario) {
		this.comentario = comentario;
	}
}
