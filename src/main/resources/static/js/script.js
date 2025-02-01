document.addEventListener("DOMContentLoaded", function () {
    const searchInput = document.getElementById("search-input");
    const suggestionsDiv = document.getElementById("suggestions");

    // List of predefined URLs
    const documentationLinks = [
        { name: "GeeksforGeeks", url: "https://www.geeksforgeeks.org/" },
        { name: "W3Schools", url: "https://www.w3schools.com/" },
        { name: "JavaTPoint", url: "https://www.javatpoint.com/" },
        { name: "MDN Docs", url: "https://developer.mozilla.org/en-US/" },
        { name: "Stack Overflow", url: "https://stackoverflow.com/" }
    ];

    // Search Function
    searchInput.addEventListener("input", function () {
        const query = searchInput.value.toLowerCase();
        suggestionsDiv.innerHTML = "";

        if (query) {
            const filteredLinks = documentationLinks.filter(link => link.name.toLowerCase().includes(query));

            filteredLinks.forEach(link => {
                const suggestion = document.createElement("div");
                suggestion.classList.add("suggestion-item");
                suggestion.textContent = link.name;
                suggestion.onclick = () => window.open(link.url, "_blank");
                suggestionsDiv.appendChild(suggestion);
            });
        }
    });
});
