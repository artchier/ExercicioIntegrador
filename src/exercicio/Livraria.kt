package exercicio

class Livraria() {

    var estoque = mutableListOf<Produto>()

    fun cadastrar(produto: Produto) {
        estoque.add(produto)
    }

    fun consultar(codigo: String){
        var achou = false
            estoque.forEach {
                if(it.codigo == codigo){
                    achou = true
                    println(it)
                }
            }
        if(!achou)
            println("Livro não encontrado")
    }

    fun efetuarVenda(codigo: String){
        estoque.forEach {
            when(it.codigo == codigo){
                true -> {
                    when(it.quantidadeEstoque >= 1){
                        true -> {
                            it.quantidadeEstoque--
                            println("$it vendido")
                            println("Estoque atual ${it.quantidadeEstoque}")
                        }
                        false -> println("Estoque esgotado")
                    }
                }
            }
        }
    }

    fun listarEstoque(){
        estoque.forEach {
            println(it.toString())
        }
    }
}