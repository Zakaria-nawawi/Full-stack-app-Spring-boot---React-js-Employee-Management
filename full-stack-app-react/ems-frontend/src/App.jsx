import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import HelloWord from './HelloWord'
import ListEmployeeComponent from './components/ListEmployeeComponent'
import Header from './components/Header'
import Footer from './components/Footer'
import {BrowserRouter,Route,Routes} from 'react-router-dom'
import EmployeeComponent from './components/EmployeeComponent'

function App() {

  return (
    <>
      <BrowserRouter>
        <Header />
          <Routes>
            <Route path='/' element={<ListEmployeeComponent />}></Route>
            <Route path='/employees' element={<ListEmployeeComponent />}></Route>
            <Route path='add-employee' element={<EmployeeComponent/>}></Route>
            <Route path='/edit-employee/:id'  element={<EmployeeComponent/>}></Route>
          </Routes>
        <Footer/>
      </BrowserRouter>
    </>
  )
}

export default App
