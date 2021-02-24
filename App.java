public class App {
  public static void main(String[] args) throws Exception {
    //name
    website.sendText("myName", "name", "use-submitted-name","Lucas Ocampo")
    website.sendText("myName", "css", "input[name == 'use-submitted-name']","Lucas Ocampo")
    website.sendText("myName", "xPath", "//*[@id=\"usp_form\"]/div[3]/div[1]/fieldset/input","Lucas Ocampo")
    //email
    website.sendText("myEmail", "name", "use-submitted-email","john@doe.com")
    website.sendText("myEmail", "css", "input[name == 'use-submitted-email']","john@doe.com")
    website.sendText("myEmail", "xPath", "//*[@id=\"usp_form\"]/div[3]/div[2]/fieldset/input","john@doe.com")
    //productTitle
    website.sendText("myProductTitle", "name", "use-submitted-title","defaultProduct")
    website.sendText("myProductTitle", "css", "input[name == 'use-submitted-title']","defaultProduct")
    website.sendText("myProductTitle", "xPath", "//*[@id=\"usp_form\"]/fieldset[1]/input","defaultProduct")
    //productURL
    website.sendText("myProductURL", "name", "use-submitted-url[]","http://defaultProduct")
    website.sendText("myProductURL", "css", "input[name == 'use-submitted-url[]']","http://defaultProduct")
    website.sendText("myProductURL", "xPath", "//*[@id=\"usp_form\"]/div[4]/fieldset/input","http://defaultProduct")
    //descriptionContent
    website.sendText("descriptionContent", "name", "use-submitted-content","Description about default Product")
    website.sendText("descriptionContent", "css", "textarea[name == 'use-submitted-content']","Description about default Product")
    website.sendText("descriptionContent", "xPath", "//*[@id=\"usp_form\"]/fieldset[2]/textarea","Description about default Product")
  }
}
