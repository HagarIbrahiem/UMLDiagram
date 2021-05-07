public class orderLine {
        private Product item;
        private int noUnits;

        public Product getItem() {
            return item;
        }

        public void setItem(Product item) {
            this.item = item;
        }


        public int getNoUnits() {
            return noUnits;
        }


        public void setNoUnits(int noUnits) {
            this.noUnits = noUnits;
        }

        //Association 
        public void order (Product product){

        } 
    }
