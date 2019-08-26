fun main(args: Array<String>) {
    var pessoa:Pessoa
    var listPessoas:ArrayList<Pessoa> = arrayListOf()
    var service: PessoaService = PessoaService()
    service.menuPrincipal(listPessoas)

}