package KimElena.hw5;

import java.util.Date;

public class Reader {
        private String фамилия;
        private String number;
        private String faculty;
        private String dateBorn;
        private String phone;

        @Override
        public String toString() {
                return
                        "фамилия='" + фамилия + '\'' +
                        ", number='" + number + '\'' +
                        ", faculty='" + faculty + '\'' +
                        ", dateBorn='" + dateBorn + '\'' +
                        ", phone='" + phone + '\'';
        }

        public Reader(String фамилия, String number, String faculty, String dateBorn, String phone) {
                this.фамилия = фамилия;
                this.number = number;
                this.faculty = faculty;
                this.dateBorn = dateBorn;
                this.phone = phone;
        }

        public void takeBook(int countBooks) {
                System.out.println(this.getФамилия() + "взял " + countBooks + " книги.");
        };
        public void takeBook(String [] bookName){
                String rezult = this.getФамилия() + " взял книги: ";
                for (int i = 0; i < bookName.length; i++) {
                        rezult+= bookName[i] + ", ";
                }
                System.out.println(rezult);
        }

        public void takeBook(Book [] book){
                String rezult = this.getФамилия() + " взял книги: ";
                for (int i = 0; i < book.length; i++) {
                        rezult+= book[i].getName() + "( " +
                                 book[i].getAuhtor() + " " +
                                 book[i].year + "), ";
                }
                System.out.println(rezult);
        }

        public void returnBook(int countBooks) {
                System.out.println(this.getФамилия() + "вернул " + countBooks + " книги.");
        };
        public void returnBook(String [] bookName){
                String rezult = this.getФамилия() + " вернул книги: ";
                for (int i = 0; i < bookName.length; i++) {
                        rezult+= bookName[i] + ", ";
                }
                System.out.println(rezult);
        }

        public void returnBook(Book [] book){
                String rezult = this.getФамилия() + " вернул книги: ";
                for (int i = 0; i < book.length; i++) {
                        rezult+= book[i].getName() + "( " +
                                book[i].getAuhtor() + " " +
                                book[i].year + "), ";
                }
                System.out.println(rezult);
        }
        //region get set
        public String getФамилия() {
                return фамилия;
        }

        public void setФамилия(String фамилия) {
                this.фамилия = фамилия;
        }

        public String getNumber() {
                return number;
        }

        public void setNumber(String number) {
                this.number = number;
        }

        public String getFaculty() {
                return faculty;
        }

        public void setFaculty(String faculty) {
                this.faculty = faculty;
        }

        public String getDateBorn() {
                return dateBorn;
        }

        public void setDateBorn(String dateBorn) {
                this.dateBorn = dateBorn;
        }

        public String getPhone() {
                return phone;
        }

        public void setPhone(String phone) {
                this.phone = phone;
        }
        //endregion


}

