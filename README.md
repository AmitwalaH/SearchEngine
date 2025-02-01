# 📖 Coding Documentation Search Engine

🔍 A **Spring Boot-based search engine** designed specifically for **coding documentation**. This project provides **predefined links** to various programming documentation sites like **GeeksforGeeks, W3Schools, JavaTPoint**, etc.  
When a user types in the search bar, **recommendations appear** based on available links. Clicking on a suggestion **redirects** the user to the respective website.

---

## 🚀 Features

✅ **Predefined coding documentation links**  
✅ **Dynamic search suggestions** 🔍  
✅ **Instant redirection to external documentation** 🌐  
✅ **Spring Boot for Backend** (Java)  
✅ **Simple UI** (HTML, CSS)  
✅ **Fully Maven Integrated** (No external setup required)  

---

## 🛠️ Prerequisites

Before getting started, make sure you have the following installed:

✔ **Java JDK** (Version 11 or higher)  
✔ **Apache NetBeans** (Version 8.2 or later)  
✔ **GitHub Account** (for cloning the repository)  
✔ **Internet Connection** (for Maven dependencies)  

---

## 📥 Clone & Open Project in NetBeans  

Follow these **simple steps** to clone and set up the project in **NetBeans**.

### 🔹 Step 1: Clone Repository in NetBeans
1️⃣ **Open NetBeans** 🏠  
2️⃣ Go to **Team > Git > Clone...**  
3️⃣ In the **Clone Repository** window:  
   - **Repository URL:**  https://github.com/AmitwalaH/SearchEngine.git`  
   - **Authentication:** (Enter your GitHub username & password if needed)  
4️⃣ Click **Next**, select the branch (default is `main`), and click **Next** again.  
5️⃣ Choose a local directory to save the project, then click **Finish**.  

### 🔹 Step 2: Open Project in NetBeans
1️⃣ After cloning, go to **File > Open Project** 📂  
2️⃣ Navigate to the **cloned repository folder**  
3️⃣ Select the project and click **Open Project**  
4️⃣ NetBeans will **automatically detect the `pom.xml` file** and configure Maven dependencies.  

---

## ▶️ Running the Project in NetBeans  

### 🔥 Step 1: Clean & Build the Project
1️⃣ In **NetBeans**, go to the **Projects** window.  
2️⃣ **Right-click** on the project name 📁  
3️⃣ Click **"Clean and Build"** 🛠️  
4️⃣ This will **download dependencies**, compile the code, and prepare for execution.  

### 🎯 Step 2: Run the Project
1️⃣ **Right-click** on the project again  
2️⃣ Click **"Run"** ▶️  
3️⃣ The **Spring Boot application will start** automatically  
4️⃣ Wait for logs in the **Output window**. You should see something like:  


# 🎯 Tomcat started on port 8080...


### 🌐 Step 3: Open the Application
1️⃣ Open your browser and go to **http://localhost:8080**  
2️⃣ You should see the **Search Engine UI** 🖥️  
3️⃣ Type a query in the **search bar**, and select a suggestion to visit the corresponding site.  

---

## 📌 Troubleshooting  

### ⚠️ Project Not Detected in NetBeans?
✔ Ensure that **`pom.xml`** is inside the root folder  
✔ Try **File > Open Project > Select the Correct Folder**  

### ⚠️ Port 8080 Already in Use?
✔ Change the port in `src/main/resources/application.properties`  
```properties
server.port=8081
