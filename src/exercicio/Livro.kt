package exercicio

data class Livro(
    override val codigo: String,
    var titulo: String,
    var autor: String,
    var anoLancamento: String,
    override var quantidadeEstoque: Int,
    override var preco: Double
) : Produto {

    override fun toString(): String {
        return "Livro (codigo=$codigo, título='$titulo', preco=$preco, quantidade=$quantidadeEstoque)"
    }

}