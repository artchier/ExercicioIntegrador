package exercicio

data class Colecao(
    override val codigo: String,
    override var quantidadeEstoque: Int
    override var preco: Double
    var descricao: String
    var livros: List<Livro>
) : Produto {

    override fun toString(): String {
        var dados = "Colecao(codigo=$codigo, descricao='$descricao', preco=$preco)"
        produtos.forEach { dados += "\r\n\t\t" + it.toString() }
        return dados
    }
}