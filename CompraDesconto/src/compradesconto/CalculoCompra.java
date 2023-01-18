
package compradesconto;

import java.util.Scanner;

/**
 Crie uma classe com um método que lê o nome de um cliente e quatro produtos.Assim como seus preços e quantidades.
 Aplique um desconto de 15% para valores acima de R$ 1.000,00 e escreva os detalhes da compra.
 */
public class CalculoCompra {
    public String cliente,prod1,prod2,prod3,prod4;
    public int qtd1,qtd2,qtd3,qtd4;
    public double preco1,preco2,preco3,preco4,valor1,valor2,valor3,valor4,soma,desc,desc1,desc2, desc3, desc4,result;
    
public void listarProdutos(){
    
    Scanner ler = new Scanner (System.in);
    System.out.println("Digite o Nome do Cliente:");
        cliente = ler.next();
    System.out.println("Digite o nome do Produto 01:");
        prod1 = ler.next();
    System.out.println("Digite a quantidade do Produto 01:");
        qtd1 = ler.nextInt();
    System.out.println("Digite o preço do Produto 01:");
        preco1 = ler.nextDouble();
        
    System.out.println("Digite o nome do Produto 02:");
        prod2 = ler.next();
    System.out.println("Digite a quantidade do Produto 02:");
        qtd2 = ler.nextInt();
    System.out.println("Digite o preço do Produto 02:");
        preco2 = ler.nextDouble();
      
    System.out.println("Digite o nome do Produto 03:");
        prod3 = ler.next();
    System.out.println("Digite a quantidade do Produto 03:");
        qtd3 = ler.nextInt();
    System.out.println("Digite o preço do Produto 03:");
        preco3 = ler.nextDouble();
    
    System.out.println("Digite o nome do Produto 04:");
        prod4 = ler.next();
    System.out.println("Digite a quantidade do Produto 04:");
        qtd4 = ler.nextInt();
    System.out.println("Digite o preço do Produto 04:");
        preco4 = ler.nextDouble();
         ler.close();//objeto.close() = fecha o a função scanner
     
}        
public void calcularDesconto(){
    valor1 = qtd1*preco1;
    valor2 = qtd2*preco2;
    valor3 = qtd3*preco3;
    valor4 = qtd4*preco4;
    soma = valor1+valor2+valor3+valor4;
    desc1 = (valor1*0.15);
    desc2 = (valor2*0.15);
    desc2 = (valor2*0.15);
    desc3 = (valor3*0.15);
    desc4 = (valor4*0.15);
    desc = desc1+desc2+desc3+desc4;
    result = soma-desc;
    
    
    if (soma>1000){
        System.out.println("Cliente: "+cliente);
        System.out.println("Prod: "+"Qtd: "+"Vlr: "+"Desc: ");
        System.out.println(prod1+" "+qtd1+" x "+valor1+" - "+desc1);
        System.out.println(prod2+" "+qtd2+" x "+valor2+" - "+desc2);
        System.out.println(prod3+" "+qtd3+" x "+valor3+" - "+desc3);
        System.out.println(prod4+" "+qtd4+" x "+valor4+" - "+desc4);
        System.out.println("Valor: "+soma+" - Desconto: "+desc+" Total: "+result);
           
    }else {
        System.out.println("Cliente: "+cliente);
        System.out.println("Prod: "+"Qtd: "+"Vlr: ");
        System.out.println(prod1+" "+qtd1+" x "+valor1);
        System.out.println(prod2+" "+qtd2+" x "+valor2);
        System.out.println(prod3+" "+qtd3+" x "+valor3);
        System.out.println(prod4+" "+qtd4+" x "+valor4);
        System.out.println("Valor: "+soma);
        
}        
}
}
