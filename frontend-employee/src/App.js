import React from 'react'
import Home from './Home'
import EmployeeView from './components/employee/EmployeeView'
import AddEmployee from './components/employee/AddEmployee'
import EditEmployee from './components/employee/EditEmployee'
import Navbar from './components/common/Navbar'
import {BrowserRouter as Router, Routes, Route } from 'react-router-dom'

export const App = () => {
  return (
    <main className='container mt-3'>
    <Router>
      <Navbar />
      <Routes>
					<Route
						exact
						path="/"
						element={<Home />}></Route>
					<Route
						exact
						path="/view-employee"
						element={<EmployeeView />}></Route>
					<Route
						exact
						path="/add-employee"
						element={<AddEmployee />}></Route>
					<Route
						exact
						path="/edit-employee/:id"
						element={<EditEmployee />}></Route>
				</Routes>
        </Router>
    </main>
  )
}

export default App
