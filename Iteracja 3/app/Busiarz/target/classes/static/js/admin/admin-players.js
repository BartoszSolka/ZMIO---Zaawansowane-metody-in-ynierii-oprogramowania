var adminPlayers = new Vue({
    el: '#app',
    data: {
        players: []
    },

    computed: {

    },

    methods: {
        getPlayers: function () {
            return Vue.http.get('/player')
                .then(function (response) {
                    this.players = response.body.content;
                }.bind(this));
        },

        playerIdLink: function (player) {
            return "/admin-player-details?id=" + player.id;
        },
    },

    mounted: function () {
        this.getPlayers();
    },

})