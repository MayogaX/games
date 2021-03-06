package vggames.html

import vggames.shared.task.Descriptions
import vggames.shared.Game
import vggames.shared.task.Tasks
import vggames.shared.task.TaskGroup

class HtmlGame(descriptions : Descriptions) extends Game {

  override val tasks = new Tasks(
    new TaskGroup("teste", "test", descriptions,
      HtmlTask("Crie um h1 com o texto \"It's alive!!!!!\"", "bla")),
      basicStructures,
      structures,
      paragraphs,
      links,
      images,
      lists,
      tables,
      divs
      )

 
  private def basicStructures = new TaskGroup("Exercícios básicos", "html.basic", descriptions,
    new HtmlTask("Crie um parágrafo com o texto: 'Hello world!'", "basic"),
    new HtmlTask("Crie um título (h1) com o texto 'título'","basic_h1"),
    new HtmlTask("Crie um sub-título (h2) com o texto 'título 2'","basic_h2"),
    new HtmlTask("Crie um sub-título (h3) com o texto 'título 3'","basic_h3")
  );
  
  
  private def images = new TaskGroup("Imagens", "html.images",descriptions,
      new HtmlTask("Inclua uma imagem do endereço 'http://www.vidageek.net/images/logo.png' alt='logo'","image_1"),
      new HtmlTask("Inclua uma imagem do endereço 'http://www.vidageek.net/images/logo.png' " +
      		"com uma altura de 100 pixels e 'logo' como texto alternativo","image_2"),
      new HtmlTask("Inclua uma imagem do endereço 'http://www.vidageek.net/images/logo.png' " +
      		"com altura de 100 pixels, largura 200 pixels e 'logo' como texto alternativo","image_3")
  	
  );
  
  private def lists = new TaskGroup("Listas", "html.lists",descriptions,
      new HtmlTask("Crie uma lista não ordenada com os elementos: Carro, Moto e Barco", "list_1"),
      new HtmlTask("Crie uma lista ordenada com os elementos: Abacaxi, Uva e Banana", "list_2"),
      new HtmlTask("Crie uma lista de definições com os elementos Grama e Sol e suas respectivas cores Verde e Amarelo", "list_3"));
  
  private def links = new TaskGroup("Links", "html.links",descriptions,
      new HtmlTask("Crie um link para o Google","link_1"),
      new HtmlTask("Crie um título usando (h1) chamado \"Home\" que seja também um link para a página \"http://home.com\"","link_2"),
      new HtmlTask("Crie um link \"Vai\" que leva a outro local da página chamado Indice. O nome do identificador deve ser indice","link_3")
  );

  private def paragraphs=new TaskGroup("Parágrafos e formatação de texto","html.paragraphs",descriptions,
	  new HtmlTask("Crie um parágrafo com \"Oi mundo\" como conteúdo.", "paragraph_1"),
    new HtmlTask("Crie um parágrafo com \"Oi mundo\", mas com \"Oi\" em negrito.", "paragraph_2"),
  	new HtmlTask("Escreva o texto \"texto em itálico\" com a palavra \"itálico\" em itálico","paragraph_3"),
  	new HtmlTask("Escreva o texto \"texto grande\" com a palavra \"grande\" usango a tag big","paragraph_4"),  	
  	new HtmlTask("Escreva o texto \"texto pequeno\" com a palavra \"pequeno\" usando a tag small","paragraph_5"),
  	new HtmlTask("Escreva o texto com o formato mostrado no exemplo da direita","paragraph_6"),
  	new HtmlTask("Escreva o código \"System.out.println(\"Hello world!\")\" usando a tag code" ,"paragraph_7"),
  	new HtmlTask("Escreva o texto mostrado no exemplo da direita usando a tag pre","paragraph_8") 	
  );
  
  private def tables = new TaskGroup("Tabelas","html.tables",descriptions,
	  new HtmlTask("Crie uma tabela com borda, de 2 linhas e 2 colunas, com os núneros de 1 a 4.", "table_1"),
	  new HtmlTask("Crie uma tabela de 2 linhas e 2 colunas, mesclando as duas primeiras células e com o conteúdo em negrito conforme o exemplo", "table_2"),
  	  new HtmlTask("Crie uma tabela de 2 linhas e 2 colunas, mesclando a primeira coluna e com o conteúdo em negrito conforme o exemplo", "table_3")
  );
  
  private def divs = new TaskGroup("Divs","html.divs",descriptions,
	  new HtmlTask("Crie uma div", "div_1")
  );

  private def structures =new TaskGroup("Estruturas do arquivo","html.structures",descriptions,
    new HtmlTask("Escreva toda a estrutura de um arquivo html com o título \"Página html\" e conteúdo \"Oi mundo\"","structure_1"),
    new HtmlTask("Escreva a estrutura de um arquivo html com o título \"Minha página\" contendo o texto \"Conteúdo da minha página\" em negrito","structure_2"),
    new HtmlTask("Escreva a estrutura de um arquivo html com o título \"Página com link\" contendo um link para a página do Google \"www.google.com\"","structure_3")
  );
  
  def getDescription = "Um jogo muito legal para aprender Html, focado em Html5"

  def getName = "Html"

}
