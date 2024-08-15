document.addEventListener('DOMContentLoaded', function() {
    loadContent('/home');
});

function loadContent(url) {
    fetch(url)
        .then(response => response.text())
        .then(html => {
            document.getElementById('card-box').innerHTML = html;
        })
        .catch(error => console.error('Erro ao carregar conteúdo:', error));
}

async function save(){

    const form = document.getElementById('userForm');
    const formData = new FormData(form);

    const data = {};
    formData.forEach((value, key) => {
        data[key] = value;
    });

    try {
        const response = await fetch('/user/save', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(data)
        });

        const text = await response.text();
        console.log(text);
    } catch (error) {
        console.error('Erro:', error);
    }

}