package universitybuilder

class LoginController {

    def index() { 
        respond([name: 'New User'])
    }

    /**
     * Logs user into the site
     */
    def login() { }

    /**
     * Logs user out of the site
     */
    def logout() { }

    /**
     * Registers new user
     */
    def register() { }

    /**
     * Workflow for providing user forgotten password
     */
    def forgotPassword() { }
}
