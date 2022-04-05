package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String produtos[] = {"Arroz","feijao","Fuba","Sal","açucar","Brahma"};
        double precos[] = {20,10,4,3,15,5};
        int quantidade[] = {10,10,10,10,10,10};
        int carrinho[] = {0,0,0,0,0,0};
        int debitar= 0;
        Scanner s = new Scanner(System.in);
        int escolha;

        do {
            for(int i=0; i< produtos.length; i++){
                System.out.println("Código:" + i + "   Produto:" + produtos[i]+"   Quantidade em estoque:" + quantidade[i] + "          Preço Unit:R$" + precos[i]);
            }
            System.out.println("Digite o código do produto a inserir no carrinho ou -1 para sair ");
            escolha = s.nextInt();
            switch (escolha) {
                case 0:
                    System.out.println("Insira a quantidade desejada do produto");
                    debitar=s.nextInt();
                    if(debitar > quantidade[0]){
                        System.out.println("Estoque insuficiente, verifique a disponibilidade");
                    }
                    else{
                        System.out.println("Arroz inserido no carrinho");
                        quantidade[0]= quantidade[0] - debitar;
                        carrinho[0]= carrinho[0] + debitar;
                    }
                    break;
                case 1:
                    System.out.println("Insira a quantidade desejada do produto");
                    debitar = s.nextInt();
                    if(debitar > quantidade[1]){
                        System.out.println("Estoque insuficiente, verifique a disponibilidade");
                    }
                    else{
                        System.out.println("Feijão inserido no carrinho");
                        quantidade[1]= quantidade[1] - debitar;
                        carrinho[1]= carrinho[1] + debitar;
                    }
                    break;
                case 2:
                    System.out.println("Insira a quantidade desejada do produto");
                    debitar=s.nextInt();
                    if(debitar > quantidade[2]){
                        System.out.println("Estoque insuficiente, verifique a disponibilidade");
                    }
                    else{
                        System.out.println("Fuba inserido no carrinho");
                        quantidade[2]= quantidade[2] - debitar;
                        carrinho[2]= carrinho[2] + debitar;
                    }
                    break;
                case 3:
                    System.out.println("Insira a quantidade desejada do produto");
                    debitar=s.nextInt();
                    if(debitar > quantidade[3]){
                        System.out.println("Estoque insuficiente, verifique a disponibilidade");
                    }
                    else{
                        System.out.println("Sal inserido no carrinho");
                        quantidade[3]= quantidade[3] - debitar;
                        carrinho[3]= carrinho[3] + debitar;
                    }
                    break;
                case 4:
                    System.out.println("Insira a quantidade desejada do produto");
                    debitar=s.nextInt();
                    if(debitar > quantidade[4]){
                        System.out.println("Estoque insuficiente, verifique a disponibilidade");
                    }
                    else{
                        System.out.println("Açucar inserido no carrinho");
                        quantidade[4]= quantidade[4] - debitar;
                        carrinho[4]= carrinho[4] + debitar;
                    }
                    break;
                case 5:
                    System.out.println("Insira a quantidade desejada do produto");
                    debitar=s.nextInt();
                    if(debitar > quantidade[5]){
                        System.out.println("Estoque insuficiente, verifique a disponibilidade");
                    }
                    else{
                        System.out.println("Brahma inserido no carrinho");
                        quantidade[5]= quantidade[5] - debitar;
                        carrinho[5]= carrinho[5] + debitar;
                    }
                    break;
                case -1:
                    break;
                default:
                    System.out.println("O número escolhido é inválido!");
            }
        } while (escolha != -1);

        System.out.println("ITENS NO CARRINHO:");
        double totalProdutos=0;
        for(int i = 0; i < produtos.length; i++){
            if(carrinho[i]==0){}
            else{
                double totalItem = carrinho[i] * precos[i];
                totalProdutos = totalProdutos + totalItem;
                System.out.println("Nome: "+ produtos[i] + "     Qtde. no carrinho: " + carrinho[i] + "          Preço unit.: (R$)" + precos[i] + "          Preço Total: (R$)" + totalItem);
            }
        }
        double tributo = totalProdutos * 0.09;
        totalProdutos = totalProdutos * 1.09;
        System.out.println("O valor total da compra com imposto de 9%: R$:" + totalProdutos );
        System.out.println("Opções de pagamento:");
        System.out.println("[1]À vista em dinheiro ou cartão MASTERCARD, recebe 20% de desconto.");
        System.out.println("[2]À vista no cartão de crédito, recebe 15% de desconto.");
        System.out.println("[3]Em 2 vezes, preço normal de etiqueta sem juros.");
        System.out.println("[4]Em 3 vezes, preço normal de etiqueta mais juros de 10%");
        System.out.println("Qual seria a forma de pagamento?");

        escolha = s.nextInt();
        switch (escolha) {
            case 1:
                System.out.println("Wipro Store");
                System.out.println("Rua dos Bôbos, n°0 - Mercadinho - LTDA");
                System.out.println("CNPJ 1234554321-00");
                System.out.println("NOTA FISCAL");
                System.out.println("-----------------------------------------------------");
                System.out.println("-----------------------------------------------------");
                for(int i = 0; i < produtos.length; i++){
                    if(carrinho[i]==0){}
                    else{
                        double totalItem = carrinho[i] * precos[i];
                        System.out.println("Nome: "+ produtos[i] + "     Qtde. no carrinho: " + carrinho[i] + "          Preço unit.: (R$)" + precos[i] + "          Preço Total: (R$)" + totalItem);
                    }
                }
                System.out.println("-----------------------------------------------------");
                System.out.println("-----------------------------------------------------");
                double desconto = totalProdutos * 0.2;
                totalProdutos = totalProdutos - desconto;
                System.out.println("DESCONTO NA COMPRA: " + desconto);
                System.out.println("VALOR TOTAL A SER PAGO: R$ " + totalProdutos);
                System.out.println("VALOR TRIBUTARIO: R$ " + tributo);
                break;
            case 2:
                System.out.println("Wipro Store");
                System.out.println("Rua dos Bôbos, n°0 - Mercadinho - LTDA");
                System.out.println("CNPJ 1234554321-00");
                System.out.println("NOTA FISCAL");
                System.out.println("-----------------------------------------------------");
                System.out.println("-----------------------------------------------------");
                for(int i = 0; i < produtos.length; i++){
                    if(carrinho[i]==0){}
                    else{
                        double totalItem = carrinho[i] * precos[i];
                        System.out.println("Nome: "+ produtos[i] + "     Qtde. no carrinho: " + carrinho[i] + "          Preço unit.: (R$)" + precos[i] + "          Preço Total: (R$)" + totalItem);
                    }
                }
                System.out.println("-----------------------------------------------------");
                System.out.println("-----------------------------------------------------");
                desconto = totalProdutos * 0.15;
                totalProdutos = totalProdutos - desconto;
                System.out.println("DESCONTO NA COMPRA: " + desconto);
                System.out.println("VALOR TOTAL A SER PAGO: R$ " + totalProdutos);
                System.out.println("VALOR TRIBUTARIO: R$ " + tributo);
                break;
            case 3:
                System.out.println("Wipro Store");
                System.out.println("Rua dos Bôbos, n°0 - Mercadinho - LTDA");
                System.out.println("CNPJ 1234554321-00");
                System.out.println("NOTA FISCAL");
                System.out.println("-----------------------------------------------------");
                System.out.println("-----------------------------------------------------");
                for(int i = 0; i < produtos.length; i++){
                    if(carrinho[i]==0){}
                    else{
                        double totalItem = carrinho[i] * precos[i];
                        System.out.println("Nome: "+ produtos[i] + "     Qtde. no carrinho: " + carrinho[i] + "          Preço unit.: (R$)" + precos[i] + "          Preço Total: (R$)" + totalItem);
                    }
                }
                System.out.println("-----------------------------------------------------");
                System.out.println("-----------------------------------------------------");
                System.out.println("DESCONTO NA COMPRA: 0");
                System.out.println("VALOR TOTAL A SER PAGO: R$ " + totalProdutos);
                System.out.println("VALOR TRIBUTARIO: R$ " + tributo);
                break;
            case 4:
                System.out.println("Wipro Store");
                System.out.println("Rua dos Bôbos, n°0 - Mercadinho - LTDA");
                System.out.println("CNPJ 1234554321-00");
                System.out.println("NOTA FISCAL");
                System.out.println("-----------------------------------------------------");
                System.out.println("-----------------------------------------------------");
                for(int i = 0; i < produtos.length; i++){
                    if(carrinho[i]==0){}
                    else{
                        double totalItem = carrinho[i] * precos[i];
                        System.out.println("Nome: "+ produtos[i] + "     Qtde. no carrinho: " + carrinho[i] + "          Preço unit.: (R$)" + precos[i] + "          Preço Total: (R$)" + totalItem);
                    }
                }
                System.out.println("-----------------------------------------------------");
                System.out.println("-----------------------------------------------------");
                double juros = totalProdutos * 0.10;
                totalProdutos = totalProdutos + juros;
                System.out.println("JUROS NA COMPRA: " + juros);
                System.out.println("VALOR TOTAL A SER PAGO: R$ " + totalProdutos);
                System.out.println("VALOR TRIBUTARIO: R$ " + tributo);
                break;
            default:
                System.out.println("O número escolhido é inválido!");
        }

    }
}
