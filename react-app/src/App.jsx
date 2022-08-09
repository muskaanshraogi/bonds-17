import React from "react";
import BondRoutes from "./BondRoutes.jsx";
import {
  MuiThemeProvider,
  createTheme,
  CssBaseline,
} from "@material-ui/core";

const lightPallete = {
  palette: {
    type: "light",
    primary: { main: '#6C63FF', light: '#FFBE36', contrastText: '#FFFFFF' },
    secondary: { main: '#193B55', light: '#69D2E7', contrastText: '#FFFFFF' },
    background: { paper: '#EEEEEE', default: '#EEEEEE' },
  },
};

function App () {
  const theme = React.useMemo(
    () => (createTheme(lightPallete)), []
  )

  return (
    <MuiThemeProvider theme={theme}>
        <CssBaseline />
          <BondRoutes />
      </MuiThemeProvider>
  )
};

export default App;
