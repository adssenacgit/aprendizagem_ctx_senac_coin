package com.senac.projetoIntegrador.usuario.response;

public class UsuarioResponse {
	private String nome;
	private byte[] foto;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}
}
