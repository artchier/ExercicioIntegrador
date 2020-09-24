package exercicio

fun main() {
    val lv1 = Livro("000", "Livro 1", "autor 1", "2010", 2, 50.00)
    val lv2 = Livro("001", "Livro 2", "autor 2", "2020", 3, 51.00)

    val colecao1 = Colecao("002", 3, 6.0, "Coleção 1", mutableListOf(lv1, lv2))


    val livraria = Livraria()
    livraria.cadastrar(lv1)
    livraria.cadastrar(lv2)
    livraria.cadastrar(colecao1)

    livraria.listarEstoque()

    println("////////////////////////")
    livraria.consultar("002")

    println("////////////////////////")
    livraria.efetuarVenda(lv1.codigo)

    println("////////////////////////")
    livraria.listarEstoque()

    println("////////////////////////")
    livraria.efetuarVenda("000")

    println("////////////////////////")
    livraria.efetuarVenda("000")

    println("////////////////////////")
    livraria.efetuarVenda("002")
}