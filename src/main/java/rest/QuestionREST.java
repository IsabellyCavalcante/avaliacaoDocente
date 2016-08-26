package rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pojo.Question;
import pojo.TipoResposta;

@RestController
public class QuestionREST {

	@RequestMapping(value = "/question/{id}", method = RequestMethod.GET)
	public Question getQuestion(@PathVariable Long id) {
		// aqui vai entrar o service que consultará depois - por hora fica
		// assim...
		List<Question> listOfQuestions = new ArrayList<Question>();
		listOfQuestions = createQuestionsList();

		for (Question question : listOfQuestions) {
			if (question.getId() == id)
				return question;
		}
		return null;
	}
	
	// Utiliy method to create question list.  
	private List<Question> createQuestionsList() {
		Question Q1 = new Question(1L, "Pergunta 1", TipoResposta.TEXTO, false);
		Question Q2 = new Question(2L, "Pergunta 2", TipoResposta.SELECAO, false);
		Question Q3 = new Question(3L, "Pergunta 3", TipoResposta.MULTIPLA_ESCOLHA, false);
		Question Q4 = new Question(4L, "Pergunta 4", TipoResposta.TEXTO, false);

		List<Question> listOfQuestions = new ArrayList<Question>();
		listOfQuestions.add(Q1);
		listOfQuestions.add(Q2);
		listOfQuestions.add(Q3);
		listOfQuestions.add(Q4);
		return listOfQuestions;
	}
}
