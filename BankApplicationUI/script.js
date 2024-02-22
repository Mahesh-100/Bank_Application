
// Function to register a new user
function registerUser(userData) {
    fetch('http://localhost:8080/bank/user', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify(userData),
    })
    .then(response => {
        if (response.ok) {
            // Registration successful
            window.location.href = 'login.html';
        } else {
            // Registration failed
            console.error('Registration failed:', response.statusText);
            window.location.href = 'register.html';
        }
    })
    .catch(error => {
        console.error('Error during registration:', error);
        // Handle error
    });
}

// Function to log in a user
function loginUser(userData) {
    fetch('http://localhost:8080/bank/user', {
        method: 'GET',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify(userData),
    })
    .then(response => {
        if (response.ok) {
            // Login successful
            
            window.location.href = 'home.html';
        } else {
            // Login failed
            console.error('Login failed:', response.statusText);
            window.location.href = 'login.html';
        }
    })
    .then(user => {
        // Display user details on the dashboard
        displayUserDetails(user);
    })
    .catch(error => {
        console.error('Error during login:', error);
        // Handle error
    });
}


function fetchUserDetails() {
    fetch('/user')
    .then(response => {
        if (!response.ok) {
            throw new Error('Failed to fetch user details');
        }
        return response.json();
    })
    .then(user => {
        // Display user details on the dashboard
        document.getElementById('username').textContent = user.username;
        document.getElementById('email').textContent = user.email;
        // Add other user details as needed
    })
    .catch(error => {
        console.error('Error fetching user details:', error);
        // Handle error
    });
}





function requestlogout() {
	window.location.href = "logout.jsp";
}
function validateAndRedirect(action) {
            var selectedAccount = document.querySelector('input[name="selectedAccount"]:checked');
            if (!selectedAccount) {
                alert("Please select an account before proceeding.");
                return false;
            }
            // Add logic to set the action parameter and submit the form
            document.getElementById('selectedAction').value = action;
            document.getElementById('accountForm').submit();
            return true;
        
  }

