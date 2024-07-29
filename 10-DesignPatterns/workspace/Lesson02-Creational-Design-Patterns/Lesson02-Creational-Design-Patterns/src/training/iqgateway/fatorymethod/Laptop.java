/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training.iqgateway.fatorymethod;

/**
 *
 * @author Sai Baba
 */
public class Laptop extends WorkStation {
    
        private String ram;
        private String ssd;
        private String cpu;

        public Laptop() {

        }

        public Laptop(String ram, String ssd, String cpu) {
            this.ram = ram;
            this.ssd = ssd;
            this.cpu = cpu;
        }

        @Override
        public String getRAM() {
            return this.ram;
        }

        @Override
        public String getSSD() {
            return this.ssd;
        }

        @Override
        public String getCPU() {
            return this.cpu;
        }
    
}
