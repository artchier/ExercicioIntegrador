package exercicio

data class Colecao(
    override val codigo: String,
    override var quantidadeEstoque: Int,
    override var preco: Double,
    var descricao: String,
    var livros: MutableList<Livro>
) : Produto {

    override fun toString(): String {
        var dados = "Coleção (codigo=$codigo, descricao='$descricao', preco=$preco, quantidade=$quantidadeEstoque)"
        livros.forEach { dados += "\r\n\t\t" + it.toString() }
        return dados
    }
}