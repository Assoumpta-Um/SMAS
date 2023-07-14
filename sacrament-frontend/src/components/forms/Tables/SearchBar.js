import React from 'react'
import { FaSearch } from 'react-icons/fa'

import "../search/searchBar.css"
function SearchBar() {
  return (
    <div className="input-wrapper">
        <FaSearch id='search-icon'/>
        <input placeholder='Type To Search...' />
    </div>
   
  )
}

export default SearchBar