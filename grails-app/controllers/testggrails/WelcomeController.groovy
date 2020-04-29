package testggrails

class WelcomeController {

    def index() {
        redirect(action:'welcome',params:params)
    }

    def welcome(){
        String name = params.name
        render "hello ${name}"
    }

    def hi(){
        String name = params.name
        ['user':name]
    }
}
