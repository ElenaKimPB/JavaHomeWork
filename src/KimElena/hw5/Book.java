package KimElena.hw5;

public class Book {
        String name;
        String auhtor;
        String year;

        public Book() {
        }

        @Override
        public String toString() {
                return
                        "name='" + name + '\'' +
                        ", auhtor='" + auhtor + '\'' +
                        ", year='" + year + '\'';
                              }

        public Book(String name, String auhtor, String year) {
                this.name = name;
                this.auhtor = auhtor;
                this.year = year;
        }


        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getAuhtor() {
                return auhtor;
        }

        public void setAuhtor(String auhtor) {
                this.auhtor = auhtor;
        }

        public String getYear() {
                return year;
        }

        public void setYear(String year) {
                this.year = year;
        }
}
