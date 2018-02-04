var template = `
<div>A custom component 3! <span>{{message}}</span></div>
`

Vue.component('my-component', {
    template: template,
    data() {
        return {
            message:'Que te follen Vue!'
        }
    }
})


var app = new Vue({
    el: '#app',
    data: function() {
        return {
            message: 'Hello World Vue!',
            todos: []
        }
    },
    created: function() {

        console.log(this.todos)

        var self = this;
        setTimeout(function() {

            var s = [
                { text: 'Learn JavaScript' },
                { text: 'Learn Vue' },
                { text: 'Build something awesome' }
            ];

            s.forEach((c) => {
                self.todos.push(c);
            });

        },2000)

    }

});