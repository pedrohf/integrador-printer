package br.com.alvoradamaringa.persistence;

import br.com.alvoradamaringa.domain;
import java.util.List;

public class DefesaComentarioDAOImpl extends GenericDAOImpl<Long, DefesaComentario> implements DefesaComentarioDAO {

    @Override
	public List<DefesaComentario> consultar(String nomeProfessor,
			String nomeCurso, String nomeAluno, Date dataApresentacao,
			String temaTcc) {
		return null;
	}

}
