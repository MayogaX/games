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
      images,
      lists)

 
  private def basicStructures = new TaskGroup("Estruturas básicas no html", "html.basic", descriptions,
    new HtmlTask("Crie um parágrafo com o texto: 'Hello world!'", "basic"),
    new HtmlTask("Crie um título (h1) com o texto 'título'","basic_h1"),
    new HtmlTask("Crie um sub-título (h2) com o texto 'título 2'","basic_h2"),
    new HtmlTask("Crie um sub-título (h3) com o texto 'título 3'","basic_h3")
  
  );
  
  
  private def images = new TaskGroup("Imagens em html", "html.images",descriptions,
      new HtmlTask("Inclua uma imagem do endereço 'http://www.vidageek.net/images/logo.png' alt='logo'","image_1"),
      new HtmlTask("Inclua uma imagem do endereço 'http://www.vidageek.net/images/logo.png' " +
      		"com uma altura de 100 pixels e 'logo' como texto alternativo","image_2"),
      new HtmlTask("Inclua uma imagem do endereço 'http://www.vidageek.net/images/logo.png' " +
      		"com altura de 100 pixels, largura 200 pixels e 'logo' como texto alternativo","image_3")
  	
  );
  
  private def lists = new TaskGroup("Listas em html", "html.lists",descriptions,
      new HtmlTask("Crie uma lista não ordenada com os elementos: Carro, Moto e Barco", "list_1"));
  
  
  def getDescription = "Um jogo muito legal para aprender Html, focado em Html5"

  def getName = "Html"

}