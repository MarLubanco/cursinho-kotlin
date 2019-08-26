class PessoaService {

    constructor()

    fun menuPrincipal(listPessoas: ArrayList<Pessoa>) {
        while (true) {
            print("1- Adicionar ")
            print("2- Inativar")
            var opcao= readLine()
            when(opcao) {
                "1" -> {
                    print("Nome: ")
                    var myName = readLine()
                    print("Idade: ")
                    var idade: String? = readLine()
                    print("Profissão: ")
                    var profissao = readLine()
                    var pessoa: Pessoa = Pessoa(myName!!, idade!!, profissao!!)
                    listPessoas.add(pessoa)
                    listPessoas.forEach { p -> println(p.toString()) }
                }
                "2" -> {
                    print("Nome do usuário a ser inativado: ")
                    var nome = readLine()
                    inativarPessoa(listPessoas, nome!!)
                    listPessoas.forEach { p -> println(p.toString()) }
                 }
            }
        }
    }

    fun inativarPessoa(listPessoas: ArrayList<Pessoa>, nome: String) {
        listPessoas.stream().filter{p -> p.nome == nome}.forEach{p -> p.ativo = 0}
    }


}