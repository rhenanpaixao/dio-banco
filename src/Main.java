public class Main {


        public static void main(String[] args) {
            Cliente rhenanp = new Cliente();
            rhenanp.setNome("RhenanP");

            Conta cc = new ContaCorrente(rhenanp);
            Conta poupanca = new ContaPoupanca(rhenanp);

            cc.depositar(100);
            cc.transferir(100, poupanca);

            cc.imprimirExtrato();
            poupanca.imprimirExtrato();
        }

    }
