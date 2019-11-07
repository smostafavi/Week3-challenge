package com.company;



    public class Employees {   //Employee class created


        private String name;
        private String email;
        private String job;

        public Employees() {  // defult constructor created

        }

        public Employees(String name, String email, String job) {

            this.name = name;
            this.email = email;
            this.job = job;
        }
            public void setName (String name){
                this.name = name;
            }
            public String getName () {
                return name;
            }
            public void setemail (String email){
                this.email = email;
            }

            public String getEmail () {

                return email;

            }
            public void setjob (String job){
                this.job = job;
            }
            public String getjob () {

                return job;

            }

        }

