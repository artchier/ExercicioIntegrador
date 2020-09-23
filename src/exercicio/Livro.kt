package exercicio

data class Livro(
    val codigo: String,
    var titulo: String,
    var autor: String,
    var anoLancamento: String,
    var quantidadeEstoque: Int,
    var preco: Double
)